<%@page import="Control.MusteriControl, Model.MusteriModel"%>
<html>
<head>
    <title>Müşteri Ekle</title>
</head>
<body>
    <form method="post" action="musteriEkle.jsp">
        Müşteri ID: <input type="text" name="musteriID"><br>
        Ad: <input type="text" name="ad"><br>
        Soyad: <input type="text" name="soyad"><br>
        <input type="submit" value="Ekle">
    </form>
</body>
</html>