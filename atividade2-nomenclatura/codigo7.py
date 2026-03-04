def celsius_to_fahrenheit(temp_celsius):
    return (temp_celsius * 9/5) + 32

def fahrenheit_to_celsius(temp_fahrenheit):
    return (temp_fahrenheit - 32) * 5/9

temperature_celsius = 25
temperature_fahrenheit = 77

print(celsius_to_fahrenheit(temperature_celsius))
print(fahrenheit_to_celsius(temperature_fahrenheit))