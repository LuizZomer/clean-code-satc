def find_maximum_value(number_list):
    maximum_value = number_list[0]
    
    for number in number_list:
        if number > maximum_value:
            maximum_value = number
            
    return maximum_value


numbers = [3, 7, 2, 9, 4]
largest_number = find_maximum_value(numbers)

print(f"Maior número: {largest_number}")