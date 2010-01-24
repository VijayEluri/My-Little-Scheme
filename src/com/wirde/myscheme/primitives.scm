(define print display)
(define (newline) (print "
"))

(define caar (lambda (l) (car (car l))))
(define cadr (lambda (l) (car (cdr l))))

(define list (lambda x x))

(define nil? (lambda (x)
	(if (eq? nil x)
		#t
		#f)))

(define (for-each f l)
	(if (nil? l)
		nil
		(begin
			(f (car l))
			(for-each f (cdr l)))))		
		
(define (reduce f l initial) 
	(if (nil? l)
		initial
		(f (car l) (reduce f (cdr l) initial))))

(define (map f l)
	(if (nil? l)
		nil
		(cons (f (car l)) (map f (cdr l)))))
		
(define (filter f l)
	(if (nil? l)
		nil
		(if (f (car l))
			(cons (car l) (filter f (cdr l)))
			(filter f (cdr l))))) 

(define (ass obj l pred)
	(if (nil? l)
		#f
		(if (pred obj (caar l))
			(car l)
			(ass obj (cdr l) pred))))
			
(define (assq obj l)
	(ass obj l eq?))
	
(define (assv obj l)
	(ass obj l eqv?))	

(define (assoc obj l)
	(ass obj l equal?))