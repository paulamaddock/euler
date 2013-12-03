int highestNum = 20
int num = 2
int i = 2
Map seminalMap = [:]

while (num <= highestNum ) {
    int seminal = num
    while (i <= seminal) {
        if (seminal % i == 0) {
            if (!seminalMap[num]) {
                seminalMap[num] = []
            }
            seminalMap[num] <<   i
            seminal = seminal / i
        } else {
        i++
        }
    }
    num++
    i=2
}

num = 2
Map largestPower = [:]
while (num <= highestNum){
    if (largestPower[seminalMap[num][seminalMap[num].size() - 1]]) {
        largestPower[seminalMap[num][seminalMap[num].size() - 1]] = seminalMap[num].count(seminalMap[num][seminalMap[num].size() - 1])
    } else if (largestPower[seminalMap[num][seminalMap[num].size() - 1]] < seminalMap[num].count(seminalMap[num][seminalMap[num].size() - 1])){
        largestPower[seminalMap[num][seminalMap[num].size() - 1]] = seminalMap[num].count(seminalMap[num][seminalMap[num].size() - 1])
    }
    num++
}

long total = 1
for (j in 0..(largestPower.keySet().size()-1)) {
    total *= Math.pow(largestPower.keySet()[j] , largestPower.values().toList()[j])
}
println total