const interest = document.querySelector("#interest");
const interestText = document.querySelector("#interestSpan");
const amountanswer = document.querySelector("#amount-answer");
const interestAnswer = document.querySelector("#interest-answer");
const forma = document.querySelector("#forma");
const answer = document.querySelector("#answer");
const yearanswer = document.querySelector("#year-answer");

interest.addEventListener("click", function (e) {
  e.preventDefault;
  interestText.textContent = parseFloat(interest.value).toFixed(2);
});

forma.addEventListener("submit", function (e) {
  e.preventDefault();

  const amount = Number(e.target["amount"].value);
  const years = Number(e.target["years"].value);
  const interest = Number(e.target["interest"].value);
  const fixedinterest = parseFloat(interest).toFixed(2);

  const ats = (amount * years * fixedinterest) / 100;

  amountanswer.textContent = amount;
  interestAnswer.textContent = fixedinterest;
  answer.textContent = parseFloat(ats).toFixed(2);
  yearanswer.textContent = new Date().getFullYear() + years;
});
