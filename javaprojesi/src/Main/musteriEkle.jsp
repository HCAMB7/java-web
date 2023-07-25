<%@page import="Control.MusteriControl, Model.MusteriModel"%>
<%
    MusteriModel musteri = new MusteriModel();
    musteri.setMusteriID(request.getParameter("musteriID"));
    musteri.setAd(request.getParameter("ad"));
    musteri.setSoyad(request.getParameter("soyad"));

    MusteriControl musteriControl = new MusteriControl();
    musteriControl.musteriEkle(musteri);
%>
<html>
<head>
    <title>Müşteri Eklendi</title>
</head>
<body>
    <h1>Müşteri başarıyla eklendi!</h1>
</body>
</html>