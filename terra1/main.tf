terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 5.00"
    }
  }

  required_version = ">= 1.2.0"
}


provider "aws" {
  region = "eu-central-1"
  #  access_key = var.aws_access_key
  #  secret_key = var.aws_secret_key
}


resource "aws_instance" "app_server" {
  count                  = var.number_of_instances
  ami                    = "ami-04e601abe3e1a910f" # ubuntu 22.04 on eu-central-1
  instance_type          = "t2.micro"
  user_data              = file("starter-script.sh")
  key_name               = "key0"
  vpc_security_group_ids = [aws_security_group.ssh.id]

  tags = {
    Name = "ExampleAppServer"
  }
}

resource "aws_security_group" "ssh" {
  name        = "ssh"
  description = "Security group for SSH access"

  ingress {
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
  egress {
    from_port        = 0
    to_port          = 0
    protocol         = "-1"
    cidr_blocks      = ["0.0.0.0/0"]
    ipv6_cidr_blocks = ["::/0"]
  }
}