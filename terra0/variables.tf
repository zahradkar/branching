variable "instance_name" {
  description = "My great instance of EC2"
  type = string
  default = "MyVeryNewInstance"
}

variable "ec2_instance_type" {
  description = "AWS EC2 instance type"
  type = string
  default = "t3.micro"
}