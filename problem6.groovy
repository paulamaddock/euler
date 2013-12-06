def b = 0
def c = 0

for ( a in 1..100) {
    b += a
    c += Math.pow(a,2)
}

println Math.pow(b,2) - c