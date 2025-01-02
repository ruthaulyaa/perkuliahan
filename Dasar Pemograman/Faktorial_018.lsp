; Nama File: Faktorial_018.lsp
; Nama: Ruth Aulya Silalahi
; NIM: 11S20018
; Tanggal: 23/02/2021
;
; Deskripsi dan spesifikasi
; =========================
; fac : integer>=0 -> integer>0
; 	{fac(n)=n! sesuai dengan refursif factorial}
; Realisasi
; Fac (n): depend on n-1
;  if (n = 1) -> 1
;  else n* Fac (n-1)
;
; Realisasi LISP:
(defun Fac (n)
	(cond ((= n 0) 1)
		  (t (* n(Fac (- n 1)))
		)
	)
)	