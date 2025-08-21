let img = document.querySelector('img');

            // 속석명이 있는 지 검사 
            let isSrc = img.hasAttribute('src');
            console.log('isSrc :', isSrc);

            // 속성값 가져오기 
            let src = img.getAttribute('src')
            console.log('src :', src);

            let src2 = img.getAttribute('src2')
            console.log('src2 :', src2);


            // setAttribute(속성명 , 속성값)
            //  속성이 없으면 속성을 만들고
            //  속성이 있으면 값을 덮어 쓴다 

            img.setAttribute('data-human','1강의실')
            img.setAttribute('data-human','10강의실')

            setTimeout(function(){
                img.setAttribute('src','https://thumbnews.nateimg.co.kr/view610///news.nateimg.co.kr/orgImg/st/2024/10/29/29_970268_59877.jpg')
            },3000)

            // 속성 지우기 
            img.removeAttribute('data-human')

            img.remove()