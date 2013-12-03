Integer i = 0
Integer j = 0
def count = 0
while (i < 1000) {
    if (i % 3 == 0 || i % 5 == 0) {
        count += i
        println i
    }
    i++
}
println count
