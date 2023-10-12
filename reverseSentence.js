function reverseSentence(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}

const inputSentence = "Hello CloudVandana !";
const reversed = reverseSentence(inputSentence);
console.log(reversed);