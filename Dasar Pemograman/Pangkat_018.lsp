; Nama File: Pangkat_018.lsp
; Nama: Ruth Aulya Silalahi
; NIM: 11S20018
; Tanggal: 23/02/2021
;
; Soal 1
; Fungsi Pangkat
;
; Definisi dan Spesifikasi 
; =========================
; Exp : 2 integer>0 -> integer>0
; 	{Exp(a,n) menghasilkan a^n dengan a/=0}
;
; Realisasi
; ==========
; {Exp(a,n)=a^n
;		=a*a*a*a*a...*a*a*a*a*a
;		=a^(n-1)}
; {Basis: n=0 -> 1
;  Rekurens: y>0 -> a*Exp(a, prec(a))}
;
(defun Pangkat (a n)
	(cond ((= n 0) 1)
		  (t (* a(Pangkat a (- n 1)))
		  )
	)
)