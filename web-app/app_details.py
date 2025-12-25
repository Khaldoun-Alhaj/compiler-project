product = {"name": "Laptop", "desc": "High performance", "price": 1200}

@app.route('/details')
def show_details():
    return render_template('test_details.html', p=product)