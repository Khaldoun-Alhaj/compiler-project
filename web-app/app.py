from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

# قاعدة بيانات في الذاكرة
products = [
    {
        "id": 0,
        "name": "MacBook_Air_M4",
        "price": "1500",
        "img": "laptop.png",
        "desc": "Powerful_M4_Chip_Performance"
    },
    {
        "id": 1,
        "name": "iPhone_16_Pro",
        "price": "1200",
        "img": "phone.png",
        "desc": "Apple_Intelligence_Features"
    }
]

@app.route("/")
def home():
    store_name = "Elite_Tech_Store"
    return render_template("list.html", products=products, store_name=store_name)

@app.route("/product/<int:p_id>")
def view_details(p_id):
    product = products[p_id]
    return render_template("details.html", p=product)

@app.route("/admin/add", methods=["GET", "POST"])
def add_product():
    if request.method == "POST":
        new_id = len(products)
        new_product = {
            "id": new_id,
            "name": request.form["name"],
            "price": request.form["price"],
            "img": request.form["img"], # الآن نأخذ اسم الصورة من النموذج
            "desc": request.form["desc"]
        }
        products.append(new_product)
        return redirect("/")
    return render_template("add.html")

# مسار عرض صفحة التأكيد
@app.route("/admin/delete_confirm/<int:p_id>")
def delete_confirm(p_id):
    target_p = products[p_id]
    return render_template("delete.html", p=target_p)

# مسار الحذف الفعلي (POST)
@app.route("/admin/execute_delete/<int:p_id>", methods=["POST"])
def execute_delete(p_id):
    if p_id < len(products):
        products.pop(p_id)
        # إعادة ترتيب الـ IDs لضمان سلامة الروابط
        for i in range(len(products)):
            products[i]["id"] = i
    return redirect("/")

if __name__ == "__main__":
    app.run(debug=True)