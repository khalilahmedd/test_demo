def test (){
echo "this is test step "
    
}
def archive(){

    echo "this is archive step "
}
def package(){

    echo "this is archive step "
}
def build(){
echo "this is the archive stage "
echo "this is the deploy version is ${params.Version}"

}
return this
