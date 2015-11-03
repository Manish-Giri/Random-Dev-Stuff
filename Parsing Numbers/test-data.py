import re
numbers = []
hand = open('regex_sum_190017.txt')
for line in hand:
    line = line.rstrip()
    y = re.findall('[0-9]+', line)
    if len(y) > 0:
        for x in y:
            num = int(x)
            numbers.append(num)
        # numbers.append(y)

result = 0
for num in numbers:
     result += num

# print(numbers)
print(result)
