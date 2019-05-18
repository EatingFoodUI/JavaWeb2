CREATE TABLE `user`(
  `id` int(11) not null auto_increment,
  `name` varchar(255) not null,
  `pwd` varchar(255) not null,
  `sex` varchar(255) not null,
  `home` varchar(255) not null,
  `info` varchar(255) not null,
  primary key (`id`)
)engine = InnoDB auto_increment=5 default charset =utf8;
