window.addEventListener('load', bind)
function bind() {
    document.querySelector('#keyword')
        .addEventListener('focus', () => {
            const keyword = document.querySelector('#keyword')
            keyword.style.backgroundColor = 'gray';
        })
    document.querySelector('#keyword')
        .addEventListener('blur', () => {
            const keyword = document.querySelector('#keyword')
            keyword.style.backgroundColor = '';
        })
    const keyword = document.querySelector('#keyword')

    const r = parseInt(Math.random() * 256)
    const g = parseInt(Math.random() * 256)
    const b = parseInt(Math.random() * 256)
    const a = Math.random()

    // keyword.style.backgroundColor = rgba(${r},${g},${b},${a});



    document.querySelector('#site')
    .addEventListener('change', () => {

            const value = document.querySelector('#site').value
            console.log('change 이벤트 의 value',value)
            const form = document.querySelector('#form')

            if(value == 1 ){
                form.setAttribute('action','https://search.naver.com/search.naver')
            } else if (value == 2){
                form.setAttribute('action','https://www.google.com/search?')
            }
        })
        document.querySelector('#form')
        .addEventListener('submit',(event)=>{
            // html 태그의 기본 (고유) 기능을 막아줌event.preventDefault()

            const value = document.querySelector('#keyword').value

            if(value.trim().lengtsh < 2){
                alert('검색어는 두글자 이상')
            }else{
                // submit
                document.querySelector('#form').submit();
            }
        })
        // 컨트롤 c 금지
        addEventListener('copy',(event)=>{
            event.preventDefault();
            alert('복사금지')
        })
        // 컨트롤 x 금지
        addEventListener('cut',(event)=>{
            event.preventDefault();
            alert('복사금지')
        })
        //  드래그 방지
        addEventListener('selectstart',(event)=>{
            event.preventDefault();
        })






        const chk = document.querySelectorAll('.chk')
        const to = document.querySelector('#to')
        const btn = document.querySelector('#btn')
        const chks = document.querySelector('.chk_all')


        btn.addEventListener('click',()=>{
            const selected = [];
            chk.forEach((c)=>{
                if( c.checked){
                    selected.push(c.value)
                } 
            })
            if(selected.length > 0){
                to.innerHTML = '토핑:' + selected.join(',') 
            } else {
                to.innerHTML = '토핑없음'
            }
        })
    }

