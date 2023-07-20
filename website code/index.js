let readMoreLess = document.getElementById('read-more-less'); 
let aboutUsSection = document.getElementById('about-us'); 
let aboutUsContent = document.getElementById('about-content'); 
let open = false; 

readMoreLess.addEventListener("click", ()=>{
    if( readMoreLess.textContent == "Read More" ){
        readMoreLess.textContent = "Read Less"; 
        open = true; 
    }else{
        readMoreLess.textContent = "Read More"; 
        open = false; 
    }

    if(open ===  true){
        aboutUsSection.style.height = "max-content"; 
        aboutUsSection.style.background = "rgb(23, 99, 186)"; 
        aboutUsContent.style.opacity = 1;
    }else{
        aboutUsSection.style.height = "300px"; 
        aboutUsSection.style.background = "linear-gradient(to top, black 30%, rgb(23, 99, 186) )";
        aboutUsContent.style.opacity = 0.4;
    }

})