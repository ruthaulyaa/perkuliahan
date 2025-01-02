; Nama File: Fibbonaci_018.lsp
; Nama: Ruth Aulya Silalahi
; NIM: 11S20018
; Tanggal: 23/02/2021
;
; Soal 3
; Fibonacci
;
; Definisi dan spesifikasi
; Fib (a b n) : integer>0 -> integer>0
; 	{Fib (a b n) }
; Realisasi 
; Fib (a b n) : depend on (n) 
; F (n) = F (n-1) + F (n-2)
;
; Realisasi
(defun fib (a b n)
	(cond ((= n 1) a)
		  ((= n 2) b)
		  (t(+ fib a b (- n 1))) (* b (fib a b (- n 2)))
	)
)
(defun fib (number)
	(cond ((< number 2) number)
		  (t 
			(+ (fib (- number 1))
			   (fib (- number 2)
			   )
			)
		)		
	)	
)