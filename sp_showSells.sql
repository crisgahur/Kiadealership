CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_show_sells`()
BEGIN
 SELECT * FROM SELL;
END