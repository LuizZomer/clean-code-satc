def find_smallest_odd_number(number_list):
    smallest_odd = None
    
    for number in number_list:
        if number % 2 != 0:
            if smallest_odd is None or number < smallest_odd:
                smallest_odd = number
                
    return smallest_odd


print(find_smallest_odd_number([3, 10, 7, 8, 15]))