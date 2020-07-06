import {Entity} from './Entity';

export class Animal extends Entity{
  breed: string;
  name: string;
  age: number;
  type: string;
  points: number;
  constructor(id ?: number, name ?: string, breed ?: string, age ?: number, type ?: string, points ?: number) {
    super(id);
    this.breed = breed;
    this.name = name;
    this.age = age;
    this.type = type;
    this.points = points;
  }
}
