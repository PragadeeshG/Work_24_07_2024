create table if not exists reference_policy_data(
ref_code varchar(255) not null,
ref_name varchar(255) null,
local_policy varchar(255) null,
trade_policy varchar(255) null,
short_description varchar(255) null,
data_indicator varchar(255) null,
consumed_by varchar(255) null,
data_arc Integer null,
params varchar(255) null,
filter varchar(255) null,
status varchar(255) null,
constraint reference_policy_data_pk primary key(ref_code));