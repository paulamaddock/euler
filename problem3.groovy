long seminal = 600851475143

long i = 2
long j = 2
long numberCheck
List seminalList = []
println seminal
while (i < seminal) {
    if (seminal % i == 0) {
        seminalList << (seminal / i)
        seminal = seminal / i
    }
    i++
}
println seminalList[seminalList.size - 1]