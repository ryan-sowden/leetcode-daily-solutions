## Coding HashMaps

# 1. Adding Data
city_map = {}

# values
cities = ["Calgary", "Vancouver", "Toronto"]
#initialsing the key
city_map["Canada"] = []
#Adding the values to the empty array
city_map["Canada"] += cities
print(city_map) #result: {'Canada': ['Calgary', 'Vancouver', 'Toronto']}

hashmap = {'brand': "Ford", 'model': "Mustang", 'year': 1964}
# 2. Retrieving Data
hashmap.keys() # - Returns all the keys from dict in the form of a list
hashmap.values() # - Returns all the values from dict in the form of list
hashmap.items() # - Returns all the keyvalue pairs as tuples

print()
print(hashmap.keys())
print(hashmap.values())
print(hashmap.items())