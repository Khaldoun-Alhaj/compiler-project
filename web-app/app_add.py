@app.route('/add')
def add_page():
    new_item = "Pending"
    return render_template('test_add.html')