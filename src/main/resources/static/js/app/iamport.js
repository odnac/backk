 function iamport(){
     var IMP = window.IMP;
     IMP.init("imp26459540");
     IMP.request_pay({
         pg : 'kcp',
         pay_method : 'card',
         merchantuid : 'merchant' + new Date().getTime(),
         name : '미술품1', //결제창에서 보여질 이름
         amount : '50000', //실제 결제되는 가격
         buyer_email : 'tmvkdl1369@naver.com',
         buyer_name : '갓건희',
         buyer_tel : '010-4802-6746',
         buyer_addr : '서울 강남구 도곡동',
         buyer_postcode : 123-456
}, function(rsp) {
        console.log(rsp);
        if ( rsp.success ) {
            var msg = '결제가 완료되었습니다.';
            msg += '고유ID : ' + rsp.imp_uid;
            msg += '상점 거래ID : ' + rsp.merchant_uid;
            msg += '결제 금액 : ' + rsp.paid_amount;
            msg += '카드 승인번호 : ' + rsp.apply_num;
        }
        else {
            var msg = '결제에 실패하였습니다.';
            msg += '에러내용 : ' + rsp.error_msg;
        }
        alert(msg);
    });
}
