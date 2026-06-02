from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()

# Open Amazon
driver.get("https://www.amazon.in")

# Search Product
driver.find_element(By.ID, "twotabsearchtextbox").send_keys("Laptop")

# Click Search Button
driver.find_element(By.ID, "nav-search-submit-button").click()

time.sleep(3)

print("Product Search Successful")

driver.quit()

