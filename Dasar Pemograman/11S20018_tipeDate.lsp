; Nama File: 11S20018_tipeDate.lsp
; Nama: Ruth Aulya Silalahi
; NIM: 11S20018
; Tanggal: 16/02/2021

;===========================
; Tipe Bentukan DATE
; nextDay
; yesterday

;=================================
; Definisi dan Spesifikasi Type
; type DD : integer [1 ... 31]
; 		{definisi ini hanya untuk menamakan type integer dengan nilai 
;		 tertentu supaya mewakili hari sehingga suatu nilai integer dapat mewakili hari yang absah}
; type MM : integer [1 ... 12]
; 		{definisi ini hanya untuk menamakan type integer dengan daerah nilai tertentu supaya mewakili bulan}
; type YY : integer>0
; 		{definisi ini hanyalah untuk menamakan type integer dengan daerah nilai tertentu supaya mewakili tahun}
; type DATE <d: DD, m:MM, y: YY>
; 		{<d,m,y> adalah tanggal d bulan m tahun y}

;Realisasi:
(defun typeDD (h)
	(if (and (integerp h) (>= h 1) (<= h 31)) T Nil)
)
(defun typeMM (b)
	(if (and (integerp b) (>= b 1) (<= b 12)) T Nil)
)
(defun 	typeYY (n)
	(if (and (integerp n) (>= n 1)) T Nil)

)
(defun typedate (h b n)
		(if (and (typeDD h) (typeMM b) (typeYY n)) T Nil)
)	
;===================================
; Definisi dan Spesifikasi Selektor
; Day : date --> DD
; 	{Day(Date) memberikan dari d dari D yang terdiri dari <d,m,y>}
; Month : date --> MM
; 	{Month(Date) memberikan bulan m dari D yang terdiri dari <d,m,y>}
; Year : date --> YY
; 	{Year(Date) memberikan tahun y dari D yang terdiri dari <d,m,y>}

;Realisasi:
(defun Day(Date)
	(car Date)

)
(defun Month(Date)
	(car (cdr Date))

)
(defun Year(Date)
	(car (cdr (cdr Date)))

)	
;====================================
; Konstruktor
; makeDate : <DD,MM,YY> --> date
; 	{makeDate(<DD,MM,YY>) --> tanggal pada hari, bulan, tahun yang bersangkutan} 

; Realisasi
(defun makeDate(d m y)
	(cond ((typedate d m y) (list d m y)))
)	
;====================================
; Definisi dan Spesifikasi Operator/Fungsi Lain terhadap DATE
; nextDay(Date) : date --> date
; 	{nextDay(Date): menentukan tanggal berikutnya dari D yang diberikan:
;				nextDay(<21,4,2006>) adalah (<22,4,2006>)
; 				nextDay(<15,2,2016>) adalah (<16,2,2016>)
; 				nextDay(<28,2,2016>) adalah (<29,2,2016>)
;				nextDay(<28,2,2015>) adalah (<1,3,2016>)
; 				nextDay(<31,12,2015>) adalah (<1,1,2016>)
; 				nextDay(<31,1,2016>) adalah (<1,2,2016>)
; 				nextDay(<30,11,2016>) adalah (<1,12,2016>)}
; yesterday(Date) : date --> date
; 	{yesterday(Date): menentukan tanggal sebelumnya dari D yang diberikan:
; 				yesterday(<22,4,2006>) adalah (<21,4,2006>)
; 				yesterday(<16,2,2016>) adalah (<15,2,2016>)
; 				yesterday(<1,3,2016>) adalah (<29,2,2016>)
; 				yesterday(<1,3,2015>) adalah (<28,2,2015>)
; 				yesterday(<1,1,2016>) adalah (<31,12,2006>)
; 				yesterday(<1,2,2016>) adalah (<31,1,2016>)
; 				yesterday(<1,12,2016>) adalah (<30,11,2016>)

; Realisasi
(defun nextDay(Date)
	(cond 	((and (= (Day Date) 29) (= (Month Date) 2) (= (mod (Year Date) 4) 0)) (list 1 3 (Year Date)))
			((and (= (Day Date) 28) (= (Month Date) 2) (not (= (mod (Year Date) 4) 0))) (list 1 3 (Year Date)))
			((and (= (Day Date) 31) (or (= (Month Date) 1) (= (Month Date) 3) (= (Month Date) 5) (= (Month Date) 7) (= (Month Date) 8) (= (Month Date) 10))) (list 1 (+ (Month Date) 1) (Year Date)))
			((and (= (Day Date) 30) (or (= (Month Date) 4) (= (Month Date) 6) (= (Month Date) 9) (= (Month Date) 11))) (list 1 (+ (Month Date) 1) (Year Date)))
			((and (= (Day Date) 31) (= (Month Date) 12)) (list 1 1 (+ (Year Date) 1)))
			(t (list (+ (Day Date) 1) (Month Date) (Year Date)))
	)		
)
(defun yesterday(Date)
	(cond 	((and (= (Day Date) 1) (= (Month Date) 3) (= (mod (Year Date) 4))) (list 29 2 (Year Date)))
			((and (= (Day Date) 1) (= (Month Date) 3) (not (= (mod (Year Date) 4) 0))) (list 28 2 (Year Date)))
			((and (= (Day Date) 1) (or (= (Month Date) 2) (= (Month Date) 4) (= (Month Date) 6) (= (Month Date) 8) (= (Month Date) 9) (= (Month Date) 11))) (list 31 (- (Month Date) 1) (Year Date)))
			((and (= (Day Date) 1) (or (= (Month Date) 5) (= (Month Date) 7) (= (Month Date) 12))) (list 30 (- (Month Date) 1) (Year Date)))
			((and (= (Day Date) 1) (= (Month Date) 1)) (list 31 12 (- (Year Date) 1)))
			(t (list (- (Day Date) 1) (Month Date) (Year Date)))
	)		
)	
;======================================
; Predikat
; IsEqD? : 2 date --> boolean
; 	{isEqD(Date1,Date2): membandingkan kedua nilai benar jika d1=d2, mengirimkan true jika d1=d2 dan m1=m2 dan y1=y2}
; IsBefore? : 2 date --> boolean 
; 	{isBefore(Date1,Date2): mengembalikan nilai true jika D1 adalah "sebelum" D2}
; IsKabisat? : integer --> boolean
;	{IsKabisat?(a) true jika tahun 1900+a adalah tahun kabisat: habis dibagi 4 tetapi tidak habis dibagi 100, atau habis dibagi 400}

; Realisasi
(defun IsEqD(Date1 Date2)
	(cond (and (= (Day Date1) (Day Date2)) (= (Month Date1) (Month Date2)) (= (Year Date1) (Year Date2))) T Nil)

)
(defun IsBefore(Date1 Date2)
	(cond (and (yesterday (Date2) (yesterday Date1)) T Nil)
)
(defun IsKabisat(a) 
	(cond (or (and (= (mod a 4) 0) (not (= (mod a 100) 0))) (= (mod a 400) 0)) T Nil)
	
)	
;=======================================