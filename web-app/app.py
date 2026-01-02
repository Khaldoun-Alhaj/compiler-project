import os
from flask import Flask, render_template, request, redirect, url_for

class Product:
    def __init__(self, id, name, description, image, price):
        self.id = id
        self.name = name
        self.description = description
        self.image = image
        self.price = price

Products = []

next_id = 1

skills_app = Flask(__name__)



@skills_app.route("/")
def products():
    return render_template("products.html", title="Products", custom_css="products", products=Products)



@skills_app.route("/product-info")
def productInfo():
    product_id = request.args.get('product_id')
    
    Product = None
    for p in Products:
        if p.id == int(product_id):
            Product = p
            break
        
    return render_template("product_info.html", title="Product Info", custom_css="product_info", product=Product)



@skills_app.route("/add-product", methods=['GET', 'POST'])
def addProduct():
    global next_id
    
    if request.method == 'POST':
        name = request.form.get('name')
        description = request.form.get('description')
        price = request.form.get('price')
        
        image_file = request.files.get('image')
        image_filename = "static\\images\\default.jpg"
        
        if image_file and image_file.filename:
            filename = str(next_id) + "_" + image_file.filename
            image_path = os.path.join("static", "images", filename)
            
            image_file.save(image_path)
            image_filename = filename
            
        new_product = Product(
            id = next_id,
            name = name,
            description = description,
            price = float(price),
            image = f"static/images/{image_filename}"
        )
        
        Products.append(new_product)
        
        next_id += 1
        
        return redirect("/")
    
    return render_template("add_product.html", title="Add New Product", custom_css="add_product")



@skills_app.route("/remove-product")
def remove_product():
    product_id = request.args.get('product_id')
    
    for i, product in enumerate(Products):
        if str(product.id) == product_id:
            Products.pop(i)
            break
    
    return redirect(url_for('products'))

if __name__ == "__main__":
    
    skills_app.run(debug=True, host="192.168.1.8", port=9000)
