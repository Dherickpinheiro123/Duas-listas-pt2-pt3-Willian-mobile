let times = [];

for (let i = 0; i < 10; i++) {
    let time = prompt("Digite o " + (i + 1) + "º time:");

    times.push(time);
}

console.log("Times cadastrados:");

for (let i = 0; i < times.length; i++) {
    console.log(times[i]);
}