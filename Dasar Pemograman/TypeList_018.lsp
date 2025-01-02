; Nama 		: Ruth Aulya Silalahi
; Nim 		: 11S20018
; Tanggal 	: 2 Maret 2021
; =================================
;
; Definisi dan Spesifikasi
; Konso (e L)
; Konso: list of list,list --> list 
; {Konso(e,L) membentuk list baru dengan list yang diberikan sebagai elemen terakhir list}
; Realisasi LISP
(defun Konso (e L)
    (cons e L)
 )
; Definisi dan spesifikasi
; Konsb(L,e)
; Konsb:list,list of list --> list
; {Konso(L,e) memberikan sebuah list baru dengan list yang diberikan sebagai elemen pertama list}
; Realisasi LISP
(defun Konsb (L e)
	(reverse  (cons e (reverse L))
	)
)
; Definisi dan spesifikasi
; FirstElmt(L)
; FirstElmt: list tidak kosong --> list
; {FirstElmt(L) menghasilkan elemen pertama list L}
; Realisasi LISP
(defun FirstElmt(L)
    (cdr L)
)
; Definisi dan Spesifikasi
; Tail(L)
; Tail(L): list tidak kosong --> list
; {Tail(L) menghasilkan list tanpa elemen pertama list S, mungkin kosong}
; Realisasi LISP
(defun Tail (L)
    (cdr L)
)
; Definisi dan spesifikasi
; LastElmt(L)
; LastElmt(L): list tidak kosong --> list of list
; {LastElmt(L) menghasilkan elemen terakhir list L}
; Realisasi LISP
(defun LastElmt (L)
	(car (reverse L)
	)
)
; Definisi dan Spesifikasi
; Head(L)
; Head(L): list tidak kosong --> list
; {Head(L) menghasilkan list tanpa elemen terakhir list L, mungkin kosong}
; Realisasi LISP
(defun Head (L)
	(reverse (cdr (reverse L))
	)
)
; Definisi dan spesifikasi
; IsEmpty (L)
; IsEmpty (L) : List -> boolean
; {IsEmpty (L) benar jika S adalah list kosong}
; Realisasi LISP
(defun IsEmpty (L)
	(null L)
)
; Definisi dan spesifikasi
; IsOneElmt (L)
; IsOneElmt (L) : List -> boolean
; {IsOneElmt (X,L) adalah benar jika list L hanya mempunyai satu elemen}
; Realisasi LISP
(defun IsOnElmt (L)
	(and (not (Isempty L) (Isempty (cdr L)))
	)
)
; IsEqual
; DEFENISI DAN SPESIFIKASI
; IsEqual (L1,L2) benar jika list hanya mempunyai satu elemen
; REALISASI LISP
(defun IsEqual (L1 L1)
	(equal L1 L2)
)
; Definisi dan Spesifikasi
; nbElmtS(L)
; nbElmtS(L): list of list --> integer
; {nbElmtS(S) menghasilkan banyaknya elemen list, nol jika kosong}
; Realisasi LISP
(defun NbElmt (L)
	(length L)
)
; ElmtKeN
; DEFENISI DAN SPESIFIKASI
; ElmtKeN (N,L) mengirimkan elemen list yang ke N; N<= NbElmt (L) dan N>=0)
; REALISASI LISP
(defun ElmtKeN (n L)
	(cond (( = n l ) (FirstElement (L)))
	   (t (ElmtKeN (- n 1) (Tail L)))
	)
)
; COPY
; DEFENISI DAN SPESIFIKASI
; Copy (L) menghasilkan list yang identik dengan list asal
; REALISASI LISP
(defun Copy (L)
	(cond ((IsEmpty L)))
		(t (Konso (FirstElement L)) (Copy (Tail (L)))
		)
)
;======================================================
; Definisi dan Spesifikasi
; Konkat (L1,L2)
; Konkat : 2 List -> List
; {Konkat(L1,L2) menghasilkan konkatenasi 2 buah list, dengan list L2 "sesudah" List L1}
; Realisasi LISP
(defun Konkat (L1 L2)
	(append L1 L2)
)
; Definisi dan Spesifikasi
; Inverse (L)
; Inverse : List -> list
; {Inverse(L) menghasilkan list L yang dibalik, yaitu urutan elemennya adalah kebalikan dari list asal}
; Realisasi LISP
(defun Inverse (L)
	(reverse L)
)
; Definisi dan Spesifikasi
; IsMemberS (X,L)
; IsMemberS : list of list, list -> boolean
; {IsMemberS (X,L adalah benar jika X adalah elemen list L}
; Realisasi LISP
(defun IsMember (X L)
	(cond ((null L)	nil) ;basis-0
		(cond ((eq X (car L)) tablet)	
		(t (ismember X (cdr L)))
		)
	)	
)