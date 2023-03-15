const submitBtn = document.getElementById('submit')
const closenBtn = document.getElementById('close')
const popup = document.querySelector('.popupContainer')

submitBtn.addEventListener('clock', function () {
    popup.classList.remove('popupActive')

})