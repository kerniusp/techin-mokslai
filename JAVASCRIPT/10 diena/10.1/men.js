const men = Number(prompt("Iveskite menesio numeri metuose"));

function metuLaikas(skaicius1) {
  switch (skaicius1) {
    case 1:
      return "Metu laikas ziema";
      break;
    case 2:
      return "Metu laikas ziema";
      break;
    case 3:
      return "Metu laikas pavasaris";
      break;
    case 4:
      return "Metu laikas pavasaris";
      break;
    case 5:
      return "Metu laikas pavasaris";
      break;
    case 6:
      return "Metu laikas vasara";
      break;
    case 7:
      return "Metu laikas vasara";
      break;
    case 8:
      return "Metu laikas vasara";
      break;
    case 9:
      return "Metu laikas ruduo";
      break;
    case 10:
      return "Metu laikas ruduo";
      break;
    case 11:
      return "Metu laikas ruduo";
      break;
    case 12:
      return "Metu laikas ziema";
      break;
    default:
      return "Menesiai yra tik nuo 1-12";
  }
}

console.log(metuLaikas(men));
