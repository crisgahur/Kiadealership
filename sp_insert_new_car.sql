CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insert_new_car`(in name_new_car varchar(50))
BEGIN
INSERT INTO car(name_car)
values(name_new_car);
END