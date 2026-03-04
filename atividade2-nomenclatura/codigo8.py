def calculate_average(grades):
    return sum(grades) / len(grades)

def is_average_passing(average):
    return average >= 60


grades = [70, 80, 50]
average_grade = calculate_average(grades)

print(is_average_passing(average_grade))