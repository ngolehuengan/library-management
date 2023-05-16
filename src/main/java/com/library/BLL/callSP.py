function_name = "updateTotalDebt(SP_Reader_UpdateTotalDebt,String reader_id,String fine)"
params_str = function_name.split("(")[1].split(")")[0] # lấy các tham số từ chuỗi
params_list = params_str.split(",")
# chuyển các tham số thành một danh sách
output_str = ""
def create_output_str(string_list):
    output_str = "\""+"CALL "+string_list[0]+"(\""+"+"
    string_list.pop(0)
    cc = 0
    for element in string_list:
        if cc == 0:
            if "String" in element:
                output_str += "\"\\\"\"+"+"{}".format(element.replace("String ", "")) + "+\"\\\"\""
            elif "localDate" in element:
                output_str += "\"\\\"\"+"+"{}".format(element.replace("localDate ", "")) + "+\"\\\"\""
            elif "int" in element:
                output_str += "Integer.toString({})".format(element.replace("int ", ""))
            else :
                output_str += "Integer.toString({})".format(element.replace("boolean ", ""))
        elif cc == len(string_list)-1:
            if "String" in element:
                output_str += "+\",\"+"+"\"\\\"\"+"+"{}".format(element.replace("String ", "")) + "+\"\\\"\"" + "+\");\""
            elif "localDate" in element:
                output_str += "+\",\"+"+"\"\\\"\"+"+"{}".format(element.replace("localDate ", "")) + "+\"\\\"\"" + "+\");\""
            elif "int" in element:
                output_str += "+\",\"+"+"Integer.toString({})".format(element.replace("int ", "")) + "+\");\""
            else:
                output_str += "+\",\"+"+"Integer.toString({})".format(element.replace("boolean ", "")) + "+\");\""
        else:
            if "String" in element:
                output_str += "+\",\"+"+"\"\\\"\"+"+"{}".format(element.replace("String ", "")) + "+\"\\\"\""
            elif "localDate" in element:
                output_str += "+\",\"+"+"\"\\\"\"+"+"{}".format(element.replace("localDate ", "")) + "+\"\\\"\""
            elif "int" in element:
                output_str += "+\",\"+"+"Integer.toString({})".format(element.replace("int ", ""))
            else :
                output_str += "+\",\"+"+"Integer.toString({})".format(element.replace("int ", ""))
        cc+=1    
    return output_str
print(create_output_str(params_list))
