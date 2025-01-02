; Nama      : Ruth Aulya Silalahi
; NIM       : 11S20018
; Nama file : tree_11S20018.lisp

; Akar
; Defenisi dan Spesifikasi
; Akar : Pohon biner tidak kosong -> elemen
; {Akar (PB) adalah akar dari P. Jika PB adalah //L,A,R\\ = Akar (PB) adalah A}
; Realisasi LISP
(defun akar (PB)
(car PB))
; Left
; Defenisi dan Spesifikasi
; Left : Pohonbiner tidak kosong -> Pohonbiner
; {Left (PB) adalah sub pohon kiri dari PB. Jika P adalah //L,A,R\\, left (PB) adalah L}
; Realisasi LISP
(defun left (PB)
(car(cdr PB)))
; Right
; Defenisi dan Spesifikasi
; Right : PohonBiner tidak kosong -> PohonBiner
; {Right (PB) adalah sub pohon kanan dari PB. Jika PB adalah //L,A,R\\, right (PB) adalah R}
; Realisasi LISP
(defun right (PB)
(car(cdr(cdr PB))))
; IsTreeEmpty
; Defenisi dan Spesifikasi
; IsTreeEmpty : PohonBiner -> boolean
; {IsTreeEmpty (PB) true jika PB kosong : (//\\)}
; Realisasi LISP
(defun IsTreeEmpty (PB)
(null PB))
; IsOneElmt
; Defenisi dan Spesifikasi
; IsOneElmt : PohonBiner -> boolean
; {IsOneElmt PB (PB) true jika PB hanya mempunyai satu elemen, yaitu akar: (//A\\)}
; Realisasi LISP
(defun IsOneElmt(PB)
(and(not(null PB))
(null (left PB))
(null (right PB))))
; IsUnerLeft
; Defenisi dan Spesifikasi
; IsUnerLeft : PohonBiner -> boolean
; {IsUnerLeftPB (PB) true jika PB hanya mengandung sub pohon kiri tidak kosong (//L A\\)}
; Realisasi LISP
(defun IsUnerLeft (PB)
	(and (not (IsTreeEmpty (Left PB)))
	(IsTreeEmpty (Left PB))))
; IsUnerRight
; Defenisi dan Spesifikasi
; IsUnerRight : PohonBiner -> boolean
; {IsUnerRightPB (PB) true jika PB hanya mengandung sub pohon kanan tidak kosong (//A R\\)}
; Realisasi LISP
(defun IsUnerRight (PB)
	(and (not (IsTreeEmpty (Right PB)))
	(IsTreeEmpty (Right PB)))	
; IsBiner 
; Defenisi dan Spesifikasi
; IsBiner : PohonBiner  tidak kosong →   boolean 
; {IsIsBiner(PB) true jika PB  mengandung sub pohon kiri dan sub pohon kanan : (//L A R\\) }    
; Realisasi LISP
(defun IsBiner (PB)
	(and (IsExitLeft PB)(IsExitRight PB)))
; IsExistLeft
; Defenisi dan Spesifikasi
; IsExitLeft : PohonBiner  tidak kosong  →   boolean 
; {IsExitLeft(PB) true jika PB  mengandung sub pohon kiri  } 
; Realisasi LISP
(defun IsExitLeft (PB)
	(not (IsTreeEmpty (Left PB))))
; IsExistRight
; Defenisi dan Spesifikasi
; IsExitRight : PohonBiner  tidak kosong  →   boolean 
; {IsExitRight(PB) true jika PB mengandung sub pohon kanan  }
; Realisasi LISP
(defun IsExitRight (PB)
	(not (IsTreeEmpty (Right PB))))

; NbElmt
; Defenisi dan Spesifikasi
; NbElmt : PohonBiner  →   integer ≥ 0 
; {NbElmt(PB) memberikan Banyaknya elemen dari pohon PB :  
; Basis :  NbElmt (//A\ \) = 1  
; Rekurens :  NbElmt (//L,A,R\\ ) = NbElmt(L) + 1 + NbELmt(R)    
; 			  NbElmt (//L,A,\ ) = NbElmt(L) + 1    
; 			  NbElmt (//A,R\\ ) =  1 + NbELmt(R)   }
; Realisasi Fungsional
; NbElmt (PB) : {PB tidak kosong }  
; if isOneElmtPB(PB) then {Basis} 1  
; else depend on PB:    
; IsBiner(PB) : NbElmt(Left(PB) + 1 + NbElmt(Right(PB)    
; IsUnerLeft(PB) : NbElmt(Left(PB) + 1    
; IsUnerRight(PB) : 1 + NbElmt(Right(PB
; Realisasi LISP
(defun NbElmt (PB)
	(cond
		((IsOneElmt PB) 1)
		(t
			(cond
				((IsBiner PB)(+ 1 (+ (NbElmt (Left PB))(NbElmt (Right PB)))))
				((IsUnerLeft PB)(+ 1 (NbElmt (Left PB))))
				((IsUnerRight PB)(+ 1 (NbElmt (Right PB))))
			)
		)
	)
)
; NbDaun
; Defenisi dan Spesifikasi
; NbDaun : PohonBiner  →   integer ≥ 0 
; {NbDaun (PB) memberikan Banyaknya daun  dari pohon PB :  
; Basis : NbDaun  (//A\ \) = 1  
; Rekurens : NbDaun  (//L,A,R\\) =  NbDaun (L) +  NbDaun(R)              
; NbDaun  (//L,A,\\) =  NbDaun (L)                     
; NbDaun  (//A,R\\) = NbDaun (R)  } 
; Realisasi Fungsional
; NbDaun (PB) : {PB tidak kosong }  
; if isOneElmtPB(PB) then {Basis} 1  
; else {Rekurens }          
; depend on PB:    
; IsBiner(PB) : NbDaun(Left(PB)) +  NbDaun(Right(PB))     
; IsUnerLeft(PB) : NbDaun(Left(PB))    
; IsUnerRight(PB) : NbDaun(Right(PB))
; Realisasi LISP
(defun NbDaun (PB)
	(cond
		((IsOneElmt PB) 1)
		(t
			(cond
				((IsBiner PB)(+ (NbDaun (Left PB))(NbDaun (Right PB))))
				((IsUnerLeft PB)(NbDaun (Left PB)))
				((IsUnerRight PB)(NbDaun (Right PB)))
			)
		)
	)
)
; RepPrefix
; Defenisi dan Spesifikasi
; RepPrefix: PohonBiner  → list of element 
; {RepPrefix (PB) memberikan representasi linier (dalam bentuk list), dengan urutan elemen list sesuai dengan urutan penulisan pohon secara prefix :  
; Basis : RepPrefix (//A\ \) = [A]  
; Rekurens : RepPrefix (//L,A,R\\) = [A] o RepPrefix(L) o  RepPrefix (R)     
;			 RepPrefix (//L,A\\) = [A] o RepPrefix(L)   
;			 RepPrefix (//A,R\\) = [A] o RepPrefix (R)  } 
; Realisasi Fungsional
; RepPrefix (PB) : {PB tidak kosong }  
; if isOneElmtPB(PB) then {Basis} [Akar(PB)]  
; else depend on PB:    
; IsBiner(PB):KonsoL(KonsoL(Akar(PB),RepPrefix(Left(PB)),        
; RepPrefix(Right(PB)))    
; IsUnerLeft(PB) : KonsoL(Akar(PB),RepPrefix(Left(PB))    
; IsUnerRight(PB) : KonsoL(Akar(PB),RepPrefix(Right(PB)) 
; Realisasi LISP
(defun RepPrefix (PB)
	(if
		(IsTreeEmpty PB) nil
		(append
			(list (Akar PB))
			(RepPrefix (Left PB))
			(RepPrefix (Right PB)))))