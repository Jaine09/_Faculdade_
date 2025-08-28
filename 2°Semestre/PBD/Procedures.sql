use northwind;

delimiter //
create procedure sp_listaprodutos()
begin
select customers.CustomerID, customers.ContactName,customers.address, customers.phone,
		orders.orderid, orders.customerid, orders.orderdate, orders.ShipVia
	from customers inner join orders 
    on customers.customerid = orders.CustomerID;
end;
//

-- para chamar a procedure use
call so_listaprodutos();

-- PROCEDURE COM PARAMETRO
delimiter //
create procedure sp_listaPedidosFiltro(idPedido int)
begin
select customers.CustomerID, customers.ContactName,customers.address, customers.phone,
		orders.orderid, orders.customerid, orders.orderdate, orders.ShipVia
	from customers inner join orders 
    on customers.customerid = orders.CustomerID 
    where orders.orderid = idPedido;
end;
//

-- chamando uma procedure com parametro
call sp_listaPedidosFiltro(10643);
