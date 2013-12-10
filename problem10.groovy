/**
 * Euler Project Problem 9 Pythagorean triplet -- euclid's formula
 */

def m = 1
def n = 2

def a = { f, g -> Math.pow(g,2) - Math.pow(f,2)}
def b = { f, g -> 2*f*g }
def c = { f, g -> Math.pow(g,2) + Math.pow(f,2)}

def bool = true
def k
while ( m < 32) {
    k = a(m,n) + b(m,n) + c(m,n)
    if ( k == 1000.0 ) {
            println a(m,n) * b(m,n) * c(m,n)
            break
    }
    if ( k > 1000.0 ) {
        m++
        n = m + 1
    }
    if ( k < 1000.0) {
        n++
    } 
    

}
