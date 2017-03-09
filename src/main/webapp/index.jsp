<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Seven Card Poker Hand Evaluator</title>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="js/evaluator.js"></script>
</head>
<body>
<script src="bootstrap/js/bootstrap.min.js"></script>

<div class="container-fluid" id="heading"><h1>Seven Card Poker Hand Evaluator</h1></div>
<div class="container-fluid" id="gallery">
    <table>
        <caption>Pick Seven Cards</caption>

        <tr><td><img id="2C" src="${pageContext.request.contextPath}/images/Card1.gif"/></td>
        <td><img id="3C" src="${pageContext.request.contextPath}/images/Card2.gif"/></td>
        <td><img id="4C" src="${pageContext.request.contextPath}/images/Card3.gif"/></td>
        <td><img id="5C" src="${pageContext.request.contextPath}/images/Card4.gif"/></td>
        <td><img id="6C" src="${pageContext.request.contextPath}/images/Card5.gif"/></td>
        <td><img id="7C" src="${pageContext.request.contextPath}/images/Card6.gif"/></td>
        <td><img id="8C" src="${pageContext.request.contextPath}/images/Card7.gif"/></td>
        <td><img id="9C" src="${pageContext.request.contextPath}/images/Card8.gif"/></td>
        <td><img id="10C" src="${pageContext.request.contextPath}/images/Card9.gif"/></td>
        <td><img id="JC" src="${pageContext.request.contextPath}/images/Card10.gif"/></td>
        <td><img id="QC" src="${pageContext.request.contextPath}/images/Card11.gif"/></td>
        <td><img id="KC" src="${pageContext.request.contextPath}/images/Card12.gif"/></td>
        <td><img id="AC" src="${pageContext.request.contextPath}/images/Card13.gif"/></td></tr>

        <tr><td><img id="2D" src="${pageContext.request.contextPath}/images/Card14.gif"/></td>
        <td><img id="3D" src="${pageContext.request.contextPath}/images/Card15.gif"/></td>
        <td><img id="4D" src="${pageContext.request.contextPath}/images/Card16.gif"/></td>
        <td><img id="5D" src="${pageContext.request.contextPath}/images/Card17.gif"/></td>
        <td><img id="6D" src="${pageContext.request.contextPath}/images/Card18.gif"/></td>
        <td><img id="7D" src="${pageContext.request.contextPath}/images/Card19.gif"/></td>
        <td><img id="8D" src="${pageContext.request.contextPath}/images/Card20.gif"/></td>
        <td><img id="9D" src="${pageContext.request.contextPath}/images/Card21.gif"/></td>
        <td><img  id="10D" src="${pageContext.request.contextPath}/images/Card22.gif"/></td>
        <td><img id="JD" src="${pageContext.request.contextPath}/images/Card23.gif"/></td>
        <td><img id="QD" src="${pageContext.request.contextPath}/images/Card24.gif"/></td>
        <td><img id="KD" src="${pageContext.request.contextPath}/images/Card25.gif"/></td>
        <td><img id="AD" src="${pageContext.request.contextPath}/images/Card26.gif"/></td></tr>
        <tr><td><img id="2H" src="${pageContext.request.contextPath}/images/Card27.gif"/></td>
        <td><img id="3H" src="${pageContext.request.contextPath}/images/Card28.gif"/></td>
        <td><img id="4H" src="${pageContext.request.contextPath}/images/Card29.gif"/></td>
        <td><img id="5H" src="${pageContext.request.contextPath}/images/Card30.gif"/></td>
        <td><img id="6H" src="${pageContext.request.contextPath}/images/Card31.gif"/></td>
        <td><img id="7H" src="${pageContext.request.contextPath}/images/Card32.gif"/></td>
        <td><img id="8H" src="${pageContext.request.contextPath}/images/Card33.gif"/></td>
        <td><img id="9H" src="${pageContext.request.contextPath}/images/Card34.gif"/></td>
        <td><img id="10H" src="${pageContext.request.contextPath}/images/Card35.gif"/></td>
        <td><img id="JH" src="${pageContext.request.contextPath}/images/Card36.gif"/></td>
        <td><img id="QH" src="${pageContext.request.contextPath}/images/Card37.gif"/></td>
        <td><img id="KH" src="${pageContext.request.contextPath}/images/Card38.gif"/></td>
        <td><img id="AH" src="${pageContext.request.contextPath}/images/Card39.gif"/></td></tr>
        <tr><td><img id="2S" src="${pageContext.request.contextPath}/images/Card40.gif"/></td>
            <td><img id="3S" src="${pageContext.request.contextPath}/images/Card41.gif"/></td>
            <td><img id="4S" src="${pageContext.request.contextPath}/images/Card42.gif"/></td>
            <td><img id="5S" src="${pageContext.request.contextPath}/images/Card43.gif"/></td>
            <td><img id="6S" src="${pageContext.request.contextPath}/images/Card44.gif"/></td>
            <td><img id="7S" src="${pageContext.request.contextPath}/images/Card45.gif"/></td>
            <td><img id="8S" src="${pageContext.request.contextPath}/images/Card46.gif"/></td>
            <td><img id="9S" src="${pageContext.request.contextPath}/images/Card47.gif"/></td>
            <td><img id="10S" src="${pageContext.request.contextPath}/images/Card48.gif"/></td>
            <td><img id="JS" src="${pageContext.request.contextPath}/images/Card49.gif"/></td>
            <td><img id="QS" src="${pageContext.request.contextPath}/images/Card50.gif"/></td>
            <td><img id="KS" src="${pageContext.request.contextPath}/images/Card51.gif"/></td>
            <td><img id="AS" src="${pageContext.request.contextPath}/images/Card52.gif"/></td></tr>
    </table>
</div>


        <div class="container">

        <select multiple class="form-control" id="lstBox1">
            <option value="2C">2C</option>
            <option value="3C">3C</option>
            <option value="4C">4C</option>
            <option value="5C">5C</option>
            <option value="6C">6C</option>
            <option value="7C">7C</option>
            <option value="8C">8C</option>
            <option value="9C">9C</option>
            <option value="10C">10C</option>
            <option value="JC">JC</option>
            <option value="QC">QC</option>
            <option value="KC">KC</option>
            <option value="AC">AC</option>

            <option value="2D">2D</option>
            <option value="3D">3D</option>
            <option value="4D">4D</option>
            <option value="5D">5D</option>
            <option value="6D">6D</option>
            <option value="7D">7D</option>
            <option value="8D">8D</option>
            <option value="9D">9D</option>
            <option value="10D">10D</option>
            <option value="JD">JD</option>
            <option value="QD">QD</option>
            <option value="KD">KD</option>
            <option value="AD">AD</option>

            <option value="2H">2H</option>
            <option value="3H">3H</option>
            <option value="4H">4H</option>
            <option value="5H">5H</option>
            <option value="6H">6H</option>
            <option value="7H">7H</option>
            <option value="8H">8H</option>
            <option value="9H">9H</option>
            <option value="10H">10H</option>
            <option value="JH">JH</option>
            <option value="QH">QH</option>
            <option value="KH">KH</option>
            <option value="AH">AH</option>

            <option value="2S">2S</option>
            <option value="3S">3S</option>
            <option value="4S">4S</option>
            <option value="5S">5S</option>
            <option value="6S">6S</option>
            <option value="7S">7S</option>
            <option value="8S">8S</option>
            <option value="9S">9S</option>
            <option value="10S">10S</option>
            <option value="JS">JS</option>
            <option value="QS">QS</option>
            <option value="KS">KS</option>
            <option value="AS">AS</option>
        </select>
            </div>


</div>



<div class="container" id="sevenToEvaluate"></div>

<br />
<div class="container" id="buttons">
<input type="button" class="btn btn-default" id="submitHand" value="VALIDATE"/>
<input type="reset" class="btn btn-default" id="resetHand" value="RESET"/>
</div>

<div class="container" id="output"><h2 id="score"></h2></div>
<div class="mastfoot container-fluid">
<footer id="footer">
    <div class="container"><p>&copy; 2017 Jason Avery.</p></div>
</footer>
</div>

</body>

</html>
