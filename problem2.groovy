Integer i = 2
Integer j = 1
Integer k = 0
Integer sumOfEven =0
List allNums = []

List evenNums = []
while (i < 4000000) {
    if (i % 2 == 0) {
        println i
        evenNums << i
    }
    allNums << i
    
    k = i
    i = j + i
    j = k
}

allNums.removeAll(evenNums)
println allNums
evenNums.collect{
    sumOfEven += it
}
println evenNums
println sumOfEven

