let counter = 0;

for (let i = 1; i <= 100; i++) {
  if (i % 2 === 0) {
    i += 3;
    console.log(i);
  } else if (i % 7 === 0) {
    i = i * 2;
    console.log(i);
  } else if (i % 8 === 0) {
    i = i / 2;
    console.log(i);
  } else{
    console.log("N/A");
    counter += 1;
  }

  if (counter > 10) {
    break;
  }
}
