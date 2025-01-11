drop table if exists evenimente;
CREATE TABLE evenimente (id int not null auto_increment primary key, denumirea varchar(40) not null, locatia varchar(40), data date, timpul int, pretul float);

insert into evenimente(denumirea, locatia, data, timpul, pretul)
    values('Concert Phoenix', 'M2', '2024-04-19', 20, 100);

insert into evenimente(denumirea, locatia, data, timpul, pretul)
    values('Concert Cargo', 'Sala Olimpia', '2024-03-18', 19, 40);

insert into evenimente(denumirea, locatia, data, timpul, pretul)
    values('O noapte furtunoasa', 'Teatrul National', '2023-09-25', 19, 60);

insert into evenimente(denumirea, locatia, data, timpul, pretul)
    values('O scrisoare pierduta', 'Teatrul National', '2023-08-20', 18, 50);