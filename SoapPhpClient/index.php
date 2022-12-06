<?php
#$soapUrl = "http://localhost:9191";
$soapUrl = "http://localhost:8080/ws";

get_all_comptes($soapUrl);
echo "\n";
get_one_compte($soapUrl, 1);
echo "\n";
convert($soapUrl, 126);

function get_all_comptes($soapUrl) {
    $xml_post_string = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://service.web.ws.jax.com/"><soapenv:Header/><soapenv:Body><ser:compteList/></soapenv:Body></soapenv:Envelope>';
    $headers = array(
        "Content-Type: text/xml"
    );
    $url = $soapUrl;
    $ch = curl_init();
    curl_setopt($ch, CURLOPT_URL, $url);
    curl_setopt($ch, CURLOPT_POST, true);
    curl_setopt($ch, CURLOPT_POSTFIELDS, $xml_post_string);
    curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
    $response = curl_exec($ch);
    curl_close($ch);
    $xml = simplexml_load_string($response);
    echo $xml->asXML();
}

function get_one_compte($soapUrl, $code) {
    $xml_post_string = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://service.web.ws.jax.com/"><soapenv:Header/><soapenv:Body><ser:getCompte><code>'.$code.'</code></ser:getCompte></soapenv:Body></soapenv:Envelope>';
    $headers = array(
        "Content-Type: text/xml"
    );
    $url = $soapUrl;
    $ch = curl_init();
    curl_setopt($ch, CURLOPT_URL, $url);
    curl_setopt($ch, CURLOPT_POST, true);
    curl_setopt($ch, CURLOPT_POSTFIELDS, $xml_post_string);
    curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
    $response = curl_exec($ch);
    curl_close($ch);
    $xml = simplexml_load_string($response);
    echo $xml->asXML();
}

function convert($soapUrl, $montant) {
    $xml_post_string = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://service.web.ws.jax.com/"><soapenv:Header/><soapenv:Body><ser:Convert><montant>'.$montant.'</montant></ser:Convert></soapenv:Body></soapenv:Envelope>';
    $headers = array(
        "Content-Type: text/xml"
    );
    $url = $soapUrl;
    $ch = curl_init();
    curl_setopt($ch, CURLOPT_URL, $url);
    curl_setopt($ch, CURLOPT_POST, true);
    curl_setopt($ch, CURLOPT_POSTFIELDS, $xml_post_string);
    curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
    $response = curl_exec($ch);
    curl_close($ch);
    $xml = simplexml_load_string($response);
    echo $xml->asXML();
}
?>
