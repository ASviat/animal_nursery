**1 - 2.**
cat > Домашние_животные Собаки Кошки Хомяки cat > Вьючные_животные Лошади Верблюды Ослы

cat Домашние_животные Вьючные_животные > Друзья_человека mkdir animals mv Друзья_человека ./animals/


**3 - 5.** 
wget https://dev.mysql.com/get/mysql-apt-config_0.8.29-1_all.deb
dpkg -i mysql-apt-config_0.8.29-1_all.deb
apt install mysql-server
dpkg -r mysql-server
