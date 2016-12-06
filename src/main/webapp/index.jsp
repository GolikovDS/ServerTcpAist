<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>АИСТ</title>

    <%--<script src="http://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>--%>
    <%--<script type="application/javascript">--%>
    <%--//        $(function () {--%>
    <%--//            sayHi();--%>
    <%--//--%>
    <%--//            function sayHi() {--%>
    <%--//                setTimeout(sayHi, 2000);--%>
    <%--//                $.ajax({--%>
    <%--//                    url: 'Timer',--%>
    <%--//                    success: function (responseText) {--%>
    <%--//                        $('#ajaxGetUserServletResponse').text(responseText);--%>
    <%--//                    }--%>
    <%--//                });--%>
    <%--//            }--%>
    <%--//        });--%>
    <script type="text/javascript">

        var webSocket = new WebSocket('ws://localhost:8080/websocket');



        webSocket.onerror = function (event) {
            onError(event)
        };

        webSocket.onopen = function (event) {
            onOpen(event)
        };

        webSocket.onmessage = function (event) {
            onMessage(event)
        };

        webSocket.onclose = function (event) {
            onClose();
        };


        function onMessage(event) {
            document.getElementById('servletResponse').innerHTML = event.data;
        }

        function onOpen(event) {
            document.getElementById('connect').innerHTML = 'Соеденение установленно';
        }

        function onError(event) {
            alert(event.data);
        }

        function onClose(event) {
            document.getElementById('connect').innerHTML = 'нение установленно';
        }

        function start() {
            var text = document.getElementById("userinput").value;
            webSocket.send(text);
            return false;
        }


        window.onbeforeunload = function(e){alert("www")}

    </script>
</head>
<body>
<h2>Состояние ППКПУ</h2>

<div id="connect"></div>
<div id="servletResponse"></div>
<br/>
</body>
</html>