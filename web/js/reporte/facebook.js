/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var scopes = 'public_profile,email';
var statusChangeCallback = function (response, callback) {
//  		console.log(response);

    if (response.status === 'connected') {
        getFacebookData();
    } else {
        callback(false);
    }
};
var checkLoginState = function (callback) {
    FB.getLoginStatus(function (response) {
        callback(response);
    });
};
var getFacebookData = function () {
    FB.api('/me', 'GET', {}, function (response) {//obtiene los datos del usuario login
        console.log(response);
        $("#name").text(response.name);
        $("#id_name").text(response.id);
    });
};
var facebookLogin = function () {
    checkLoginState(function (data) {
        if (data.status !== 'connected') {
            FB.login(function (response) {//realiza el login de facebook
                if (response.status === 'connected')
                    getFacebookData();
            }, {scope: scopes});// los permisos
        }
    });
};

var getFacebookDataLike = function () {
    FB.api('/me/likes', 'GET', {}, function (response) {
        console.log(response);
        $("like").text(response.id);
    });
};

var fecaBookGetLike = function () {
    checkLoginState(function (data) {
        if (data.status !== 'connected') {
            FB.login(function (response) {//realiza el login de facebook
                if (response.status === 'connected')
                    getFacebookDataLike();
            }, {scope: scopes});// los permisos
        }
    });
};

$(document).ready(function () {
    FB.init({
        appId: '123104449738799',
        xfbml: true,
        version: 'v10.0'
    });
    FB.getLoginStatus(function (response) {
        statusChangeCallback(response, function () {
        });
    });

    $(document).on('click', '#id_facebook', function (e) {
        facebookLogin();
    });
    
    $("#btn_like").click( function() {
        console.log('evento click');
        fecaBookGetLike();
    });

});
