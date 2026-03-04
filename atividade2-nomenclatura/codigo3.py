def convert_celsius_to_fahrenheit(celsius_degrees):
    conversion_factor = 9 / 5
    adjustment_constant = 32
    
    return (celsius_degrees * conversion_factor) + adjustment_constant


temperature_celsius = 25
temperature_fahrenheit = convert_celsius_to_fahrenheit(temperature_celsius)

print(f"{temperature_celsius}°C é igual a {temperature_fahrenheit}°F")