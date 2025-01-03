 function mySubmit(){
    let nama = document.getElementById("txtNama").value;
    myName = "Nama Saya :" + nama;
    document.getElementById("nama").innerHTML=myName;
 
    let place = document.getElementById("txtTempatLhr").value;
    myPlace = "Tempat Lahir Saya :" + place;
    document.getElementById("tempatLhr").innerHTML=myPlace;
 
    let date = document.getElementById("txtTanggalLhr").value;
    myDate = "Tanggal Lahir Saya :" + date;
    document.getElementById("tanggalLhr").innerHTML= myDate;
 
    let gender = document.getElementById("txtGender").value;
    myGender = "Jenis Kelamin Saya :" + gender;
    document.getElementById("gender").innerHTML=myGender;
 
    let school = document.getElementById("txtPendidikan").value;
    mySchool = "Pendidikan Terakhir Saya :" + school;
    document.getElementById("pendidikan").innerHTML=mySchool;
    
 
    if(nama.length == 0){
        alert("Nama harus di isi");
        document.getElementById("nama").focus();
    } else
     if(nama.length < 7){
        alert("Nama harus memiliki panjang minimal 7 karakter");
        document.getElementById("nama").focus();
    }
}