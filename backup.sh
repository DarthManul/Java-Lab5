#!/bin/bash

git stash save
git stash drop
git rev-parse HEAD
