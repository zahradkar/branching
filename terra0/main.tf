# Provider Block
provider "aws" {
  profile = "martin"
  region = "eu-west-3"
}

# Resources Block
resource "aws_instance" "server_of_martin" {
  ami = "ami-05b5a865c3579bbc4"
  instance_type = var.ec2_instance_type

  tags = {
    Name = var.instance_name
  }
}